package irvine.oeis.a076;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A076371 Occurrences of value=n in sequence A076370.
 * @author Sean A. Irvine
 */
public class A076371 extends RunLengthTransform {

  /** Construct the sequence. */
  public A076371() {
    super(new A076370());
  }
}
