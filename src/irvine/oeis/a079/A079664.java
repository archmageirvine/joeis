package irvine.oeis.a079;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a045.A045918;

/**
 * A079664 Sum_{i=1,...,n} LookAndSay(i).
 * @author Sean A. Irvine
 */
public class A079664 extends PartialSumSequence {

  /** Construct the sequence. */
  public A079664() {
    super(1, new A045918().skip());
  }
}

