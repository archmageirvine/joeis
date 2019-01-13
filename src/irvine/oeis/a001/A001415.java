package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001415.
 * @author Fred Lunnon (ALGOL68, C versions)
 * @author Sean A. Irvine (port to Java)
 */
public class A001415 implements Sequence {

  // Implements algorithm as described in "Multi-dimensional map-folding",
  // by W. F. Lunnon, The Computer J, 14, 1, pp. 75--80.  Note the original
  // paper contains a few omissions, so this actual code is based on a C
  // implementation by Fred Lunnon.

  // Significant changes: Java initializes all arrays to 0, so a lot of
  // initialization code was removed.
  // The original required the p[] array to be bordered with -1 sentinels,
  // this has been removed, since the length is implicit in a Java array.

  private int mN = -1;
  private long mCount = 0;

  protected void process(final int[] a, final int[] b, final int n) {
    mCount += n;
  }

  /* Perform  job(a, b, ...)  on each folding of  p[0] x ... x p[p.length - 1]  map,
    with sentinel  p[d+1] = -1 ; 
    where  a[l], b[l]  denote leaf folded above, below leaf  l ;
    leaves numbered  1 <= l <= n ,  l = 0  marking outside world; 
    enumerate general, normal foldings when  flag = 0, 1  resp; 
    job()  must avoid modifying array parameters;  A,B  vary given  p ;
    res/mod specify which set of folding to compute in this run.  To get the
    total you need to set res = 0 .. mod-1 in turn.  You can use mod == 0, to
    run the full set at once.
     */
  protected void foldings(final int[] p, final boolean flag, final int res, final int mod) {
    int n = 1; // leaves
    for (final int pp : p) {
      n *= pp;
    }

    final int[] a = new int[n + 1];
    final int[] b = new int[n + 1];
    final int[] count = new int[n + 1];
    final int[] gapter = new int[n + 1];
    final int[] gap = new int[n * n + 1];
    /* b[m] holds leaf below leaf m in the current folding, a[m] leaf above.
       count[m] counts sections with some gap for new leaf l below leaf m,
       gap[gapter[l-1] + j] holds  j-th (possible or actual) gap for leaf l,
       later gap[gapter[l]] holds gap where leaf l is currently inserted. */

    final int dim = p.length; // dimensions
    final int[] bigP = new int[dim + 1];
    final int[][] c = new int[dim + 1][n + 1];
    final int[][][] d = new int[dim + 1][n + 1][n + 1];
    bigP[0] = 1;
    for (int i = 1; i <= dim; i++) {
      bigP[i] = bigP[i - 1] * p[i - 1];
    }
    for (int i = 1; i <= dim; i++) {
      for (int m = 1; m <= n; m++) {
        c[i][m] = (m - 1) / bigP[i - 1] - ((m - 1) / bigP[i]) * p[i - 1] + 1;
      }
    }
    for (int i = 1; i <= dim; i++) {
      for (int l = 1; l <= n; l++) {
        for (int m = 1; m <= l; m++) {
          final int delta = c[i][l] - c[i][m];
          d[i][l][m] = ((delta & 1) == 0)
            ? c[i][m] == 1 ? m : m - bigP[i - 1]
            : c[i][m] == p[i - 1] || m + bigP[i - 1] > l ? m : m + bigP[i - 1];
        }
      }
    }

    /* bigP[i] = p[1] * ... * p[i], c[i,m] = i-th coordinate of leaf m,
       d[i,l,m] =  leaf connected to  m  in section  i  when inserting  l */
    int g = 0;
    int l = 1;
    // Kick off with null folding
    while (l > 0) { // Main backtrack loop
      if (!flag || l <= 1 || b[0] == 1) { // Filter normal case
        if (l > n) {
          process(a, b, n); // Process new folding
        } else {
          int dd = 0;
          int gg = gapter[l - 1];
          g = gg;
          /* dd counts sections in which leaf l is unconstrained;
             gg, g count possible, actual gaps for l, offset by gapter[l-1] */

          // Append to stack potential gaps for leaf l in each section
          for (int i = 1; i <= dim; i++) {
            if (d[i][l][l] == l) {
              ++dd;
            } else {
              for (int m = d[i][l][l]; m != l; m = d[i][l][b[m]]) {
                if (mod == 0 || l != mod || m % mod == res) {
                  gap[gg] = m;
                  if (count[m]++ == 0) {
                    ++gg;
                  }
                }
              }
            }
          }

          // Discard from stack potential gaps not common to all sections
          if (dd == dim) {
            for (int m = 0; m < l; m++) {
              gap[gg++] = m;
            }
          }
          for (int j = g; j < gg; j++) {
            gap[g] = gap[j];
            if (count[gap[j]] == dim - dd) {
              ++g;
            }
            count[gap[j]] = 0;
          }
        }
      }

      // If no more gaps, detach leaf l and retreat to previous level
      while (l > 0 && g == gapter[l - 1]) {
        --l;
        b[a[l]] = b[l];
        a[b[l]] = a[l];
      }
      // For each gap insert leaf l and advance to next level
      if (l > 0) {
        a[l] = gap[--g];
        b[l] = b[a[l]];
        b[a[l]] = l;
        a[b[l]] = l;
        gapter[l++] = g;
      }
    }
  }

  protected int[] getDimensions(final int n) {
    return new int[] {n, 2};
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    foldings(getDimensions(mN), true, 0, 0);
    return Z.valueOf(mCount);
  }

  /**
   * Run the counting for a particular folding.
   * @param args extent of each dimension
   */
  public static void main(final String... args) {
    if (args.length == 0) {
      System.out.println("Usage: [res/mod] dimension...");
      return;
    }
    final int res;
    final int mod;
    final int slash = args[0].indexOf('/');
    int argsUsed = 0;
    if (slash >= 0) {
      res = Integer.parseInt(args[0].substring(0, slash));
      mod = Integer.parseInt(args[0].substring(slash + 1));
      ++argsUsed;
    } else {
      res = 0;
      mod = 0;
    }
    final int[] d = new int[args.length - argsUsed];
    for (int k = 0; k + argsUsed < args.length; ++k) {
      d[k] = Integer.parseInt(args[k + argsUsed]);
    }
    final A001415 folder = new A001415();
    folder.foldings(d, true, res, mod);
    System.out.println(folder.mCount);
  }
}
