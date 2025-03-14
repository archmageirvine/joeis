package irvine.oeis.a072;

import irvine.oeis.Combiner;

/**
 * A072785 Differences between A072781 and A072738.
 * @author Sean A. Irvine
 */
public class A072785 extends Combiner {

  /** Construct the sequence. */
  public A072785() {
    super(0, new A072781(), new A072738(), SUBTRACT);
  }
}
