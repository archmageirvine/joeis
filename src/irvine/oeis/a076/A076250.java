package irvine.oeis.a076;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076250 Distance between maxima of the cototient function, divided by 6, starting at n=5.
 * @author Sean A. Irvine
 */
public class A076250 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076250() {
    super(5, new A076249().skip(5), k -> k.divide(6));
  }
}
