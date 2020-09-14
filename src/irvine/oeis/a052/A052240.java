package irvine.oeis.a052;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a030.A030181;

/**
 * A052240 McKay-Thompson series of class 7B for the Monster group.
 * @author Sean A. Irvine
 */
public class A052240 extends PrependSequence {

  /** Construct the sequence. */
  public A052240() {
    super(new SkipSequence(new A030181(), 2), 1, 0);
  }
}
