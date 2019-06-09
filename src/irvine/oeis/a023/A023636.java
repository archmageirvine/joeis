package irvine.oeis.a023;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A023636 <code>a(n) = s(3n) - s(3n-1)</code>, where <code>s( )</code> is sequence <code>A023635</code>.
 * @author Sean A. Irvine
 */
public class A023636 extends DifferenceSequence {

  /** Construct the sequence. */
  public A023636() {
    super(new PrependSequence(new A023635(), 0));
  }
}
