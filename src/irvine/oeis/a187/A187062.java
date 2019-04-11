package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A187062 Expansion of <code>2*x^2 *(4 +7*x +5*x^2 -x^3 -4*x^4 +6*x^6 +4*x^7 -x^8 -2*x^9) / ((1+x)^2 *(1+x+x^2)^2 *(1-x)^4) </code>.
 * @author Sean A. Irvine
 */
public class A187062 implements Sequence {

  private int mN = 0;

  protected String getLine(final int n, int x, int y, final int dy) {
    while (x > 0 && y >= dy) {
      --x;
      y -= dy;
    }
    // (x,y) now left most point for the line
    if (x + 2 < n && y + 2 * dy < n) {
      return x + "_" + y + "_" + dy;
    }
    return null;
  }

  private int countLines(final int n) {
    final HashSet<String> lines = new HashSet<>();
    // Start from every points, compute all possible lines that go
    // to the right (including horizontal to almost vertical)
    for (int y = 0; y < n; ++y) {
      for (int x = 0; x < n; ++x) {
        for (int dy = 0; dy < n; ++dy) {
          final String l = getLine(n, x, y, dy);
          if (l != null) {
            lines.add(l);
          }
        }
      }
    }
    return lines.size() * 2;
  }


  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(countLines(mN));
  }

  /*
  //a(n)=+2*a(n-2)+2*a(n-3)-1*a(n-4)-4*a(n-5)-1*a(n-6)+2*a(n-7)+2*a(n-8)-1*a(n-10)

  private static long mA[] = {8, 14, 26, 42, 64, 90, 134, 172, 232, 300};

  public static void main(final String[] args) {
    for (int k = 10; k < 255; ++k) {
      final long v = 2 * mA[8] + 2 * mA[7] - mA[6] - 4 * mA[5] - mA[4] + 2 * mA[3] + 2 * mA[2] - mA[0];
      System.out.println(k + " " + v);
      System.arraycopy(mA, 1, mA, 0, mA.length - 1);
      mA[9] = v;
    }
  }
  */
}
