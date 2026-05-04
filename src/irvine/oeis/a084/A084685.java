package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a085.A085307;

/**
 * A084685 a(n) is the least x such that length of fixed-point-list when A085307 is iterated and started at a(n) equals n.
 * @author Sean A. Irvine
 */
public class A084685 extends Sequence1 {

  private final DirectSequence mS = new A085307();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      Z t = Z.valueOf(++m);
      Z u;
      int cnt = 0;
      do {
        if (++cnt > mN) {
          break;
        }
        u = t;
        t = mS.a(t);
      } while (!u.equals(t));
      if (cnt == mN) {
        return Z.valueOf(m);
      }
    }
  }

  /**
   * Run a specific value.
   * @param args value
   */
  public static void main(final String[] args) {
    final A084685 seq = new A084685();
    seq.mN = Integer.parseInt(args[0]) - 1;
    System.out.println(seq.next());
  }
}
