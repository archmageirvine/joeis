package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a120.A120944;

/**
 * A029591 For <code>n&gt;0, a(n)</code> is the least quasi-Carmichael number to base <code>-n</code>, extended to <code>n=0</code> with the least composite squarefree integer.
 * @author Sean A. Irvine
 */
public class A029591 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(--mN);
    final Sequence squareFree = new A120944();
    while (true) {
      final Z t = squareFree.next();
      if (t.compareTo(n) > 0 && A029553.isQuasiCarmichael(t, mN)) {
        return t;
      }
    }
  }
}
