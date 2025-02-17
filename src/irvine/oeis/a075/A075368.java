package irvine.oeis.a075;

import irvine.oeis.Combiner;
import irvine.oeis.a034.A034386;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075368 extends Combiner {

  /** Construct the sequence. */
  public A075368() {
    super(1, new A075367(), new A034386().skip(), DIVIDE);
  }
}
