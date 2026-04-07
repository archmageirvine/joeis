package irvine.oeis.a394;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a081.A081585;
import irvine.oeis.a108.A108099;

/**
 * A394499 Starting at one corner of n X n grid of dots, the maximum number of edges that can be drawn without lifting the pencil or going over a previously drawn edge.
 * @author Sean A. Irvine
 */
public class A394499 extends InterleaveSequence {

  /** Construct the sequence. */
  public A394499() {
    super(1, new A081585().skip().prepend(0), new A108099());
  }
}
