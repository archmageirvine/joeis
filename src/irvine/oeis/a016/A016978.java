package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016978 a(n) = (6*n + 5)^10.
 * @author Sean A. Irvine
 */
public class A016978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016978() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {9765625, 25937424601L, 2015993900449L, 41426511213649L, 420707233300201L, 2758547353515625L, 13422659310152401L, 52599132235830049L, 174887470365513049L, 511116753300641401L, 1346274334462890625L});
  }
}
