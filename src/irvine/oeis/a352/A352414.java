package irvine.oeis.a352;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352414 G.f. A(x) satisfies: A(x)^5 = (1-x) * (A(x) + x)^4.
 * @author Georg Fischer
 */
public class A352414 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352414() {
    super(0, "[[0],[-1032840,981198,-341411,51642,-2869],[1996560,-2237172,926652,-167916,11220],[-1195200,1650168,-849778,192744,-16190],[219600,-407772,283532,-87156,9940],[-3240,12738,-17283,9534,-1845],[0,840,-1712,1152,-256]]", "1,3,-10", 0);
  }
}
