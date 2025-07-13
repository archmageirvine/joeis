package irvine.oeis.a078;

import irvine.oeis.Combiner;

/**
 * A078702 Number of ways to lace a shoe that has n pairs of eyelets such that each eyelet has at least one direct connection to the opposite side.
 * @author Sean A. Irvine
 */
public class A078702 extends Combiner {

  /** Construct the sequence. */
  public A078702() {
    super(1, new A078698(), new A078700(), (a, b) -> a.add(b).divide2());
  }
}

