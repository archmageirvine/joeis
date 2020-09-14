package irvine.oeis.a101;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007241;

/**
 * A101558 McKay-Thompson series of class 2A for the Monster group.
 * @author Sean A. Irvine
 */
public class A101558 extends PrependSequence {

  /** Construct the sequence. */
  public A101558() {
    super(new SkipSequence(new A007241(), 2), 1, 0);
  }
}
