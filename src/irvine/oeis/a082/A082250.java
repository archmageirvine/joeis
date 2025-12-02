package irvine.oeis.a082;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082250 a(n) = A082249(n)/7.
 * @author Sean A. Irvine
 */
public class A082250 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082250() {
    super(1, new A082249(), k -> k.divide(7));
  }
}
