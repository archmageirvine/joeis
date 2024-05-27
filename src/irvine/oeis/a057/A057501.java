package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057501 Signature-permutation of a Catalan Automorphism: Rotate non-crossing chords (handshake) arrangements; rotate the root position of general trees as encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057501 extends A014486 {

  /**
   * Rotate handshakes by one position.
   * @param h S-expression
   * @return rotated version
   */
  public static SExpression rotateHandshakesP(final SExpression h) {
    if (h.isEmpty()) {
      return h;
    } else {
      final SExpression res = new SExpression();
      res.addAll(h.car());
      res.add(h.cdr());
      return res;
    }
  }

  /**
   * Rotate handshakes by one position.
   * @param h S-expression
   * @return rotated version
   */
  public static Z rotateHandshakes(final Z n) {
    return rotateHandshakesP(SExpression.binexp2pars(n)).toZ();
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(rotateHandshakes(super.next()));
  }
}
