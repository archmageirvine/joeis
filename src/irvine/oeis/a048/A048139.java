package irvine.oeis.a048;

import java.util.Arrays;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048139 Number of planar partitions of n, when partitions that are rotations of each other (when regarded as 3-D objects) are counted only once.
 * @author Sean A. Irvine
 */
public class A048139 implements Sequence {

  // todo This is actually a new attempt at A048141
  // todo this is perhaps C3v + C3 !!
  // todo in general may need to add six points --- not 3

  private int mN = 0;

  // Attempt 3

  private boolean isOverMajored(final int[] outer, final int[] inner) {
    if (inner.length > outer.length) {
      return false;
    }
    if (inner[0] >= outer[0]) {
      return false;
    }
    for (int k = 1; k < inner.length; ++k) {
      if (inner[k] > outer[k]) {
        return false;
      }
    }
    return true;
  }

  private boolean isPerfectlyBalanced(final int[] p) {
    // todo it would be nice to generate these directly rather than subsetting for all partitions
    for (int k = 0; k < p.length; ++k) {
      if (p[k] > p.length || p[p[k] - 1] <= k) {
        return false;
      }
    }
    return true;
  }

  private long count(final int n, final int[] majors, final String prefix) {
    System.out.println(prefix + n + " remains, major=" + Arrays.toString(majors));
    if (n == 0) {
      return 1;
    }
    if (majors.length == 0) {
      return 0;
    }
    long cnt = 0;
    for (int arm = n; arm > 0; --arm) {
      long c = 0;
      final IntegerPartition part = new IntegerPartition(arm);
      int[] p;
      while ((p = part.next()) != null) {
        //System.out.println(prefix + "Partition arm=" + arm + " " + Arrays.toString(p));
        if (!isPerfectlyBalanced(p)) {
          continue;
        }
        final int residue = n - 3 * (arm - p[0]) - 1;
        //final int residue = n - (2 * arm - p[0]);
        if (residue < 0) {
          continue;
        }
        //System.out.println(prefix + "Balanced: n=" + arm + " " + Arrays.toString(p) + " leaves " + residue);
        if (isOverMajored(majors, p)) {
          final long contrib = count(residue, Arrays.copyOfRange(p, 1, p.length), prefix + "  ");
          System.out.println(prefix + "n=" + arm + " r=" + residue + " " + Arrays.toString(p) + " contributes " + contrib);
          c += contrib;
        }
      }
      cnt += c;
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    System.out.println("Trying for " + mN);
    long count = 0;
    for (int arm = mN; arm > 0; --arm) {
      long c = 0;
      final IntegerPartition part = new IntegerPartition(arm);
      int[] p;
      while ((p = part.next()) != null) {
        //System.out.println("  Partition: " + Arrays.toString(p));
        if (!isPerfectlyBalanced(p)) {
          continue;
        }
        final int residue = mN - 3 * (arm - p[0]) - 1;
        //final int residue = mN - (2 * arm - p[0]);
        if (residue < 0) {
          continue;
        }
        System.out.println("  Balanced: n=" + arm + " " + Arrays.toString(p) + " leaves " + residue);
        final long pc = count(residue, Arrays.copyOfRange(p, 1, p.length), "    ");
        System.out.println("  " + Arrays.toString(p) + " contributes " + pc);
        c += pc;
      }
      count += c;
    }
    return Z.valueOf(count);
  }

}

