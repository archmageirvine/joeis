package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-03-14g/dirtraf at 2024-03-14 21:15

import irvine.oeis.a005.A005940;
import irvine.oeis.a083.A083254;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A324052 a(n) = A083254(A005940(1+n)).
 * @author Georg Fischer
 */
public class A324052 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A324052() {
    super(0, new A083254(), new A005940());
  }
}
