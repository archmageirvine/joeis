package irvine.oeis.a078;

import irvine.oeis.Combiner;

/**
 * A078934 Smallest semiperimeter of integral rectangle with area n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A078934 extends Combiner {

  /** Construct the sequence. */
  public A078934() {
    super(1, new A078935(), new A078936(), ADD);
  }
}
