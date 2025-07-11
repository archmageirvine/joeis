package irvine.oeis.a078;

import irvine.oeis.Combiner;

/**
 * A078675 Number of ways to lace a shoe that has n pairs of eyelets.
 * @author Sean A. Irvine
 */
public class A078675 extends Combiner {

  /** Construct the sequence. */
  public A078675() {
    super(new A078602(), new A078676(), (a, b) -> a.add(b).divide2());
  }
}

