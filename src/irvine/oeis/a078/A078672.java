package irvine.oeis.a078;

import irvine.oeis.Combiner;
import irvine.oeis.a007.A007022;

/**
 * A078672 Number of simple 4-regular 4-edge-connected but not 3-connected plane graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A078672 extends Combiner {

  /** Construct the sequence. */
  public A078672() {
    super(6, new A078666(), new A007022().skip(5), SUBTRACT);
  }
}
