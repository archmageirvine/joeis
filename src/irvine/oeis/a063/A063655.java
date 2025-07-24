package irvine.oeis.a063;

import irvine.oeis.Combiner;
import irvine.oeis.a033.A033676;
import irvine.oeis.a033.A033677;

/**
 * A063655 Smallest semiperimeter of integral rectangle with area n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A063655 extends Combiner {

  /** Construct the sequence. */
  public A063655() {
    super(1, new A033676(), new A033677(), ADD);
  }
}
