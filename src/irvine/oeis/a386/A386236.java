package irvine.oeis.a386;

import irvine.oeis.Combiner;
import irvine.oeis.a046.A046737;
import irvine.oeis.a046.A046738;

/**
 * A386236 allocated for Peter Munn.
 * @author Sean A. Irvine
 */
public class A386236 extends Combiner {

  /** Construct the sequence. */
  public A386236() {
    super(1, new A046738(), new A046737(), DIVIDE);
  }
}
