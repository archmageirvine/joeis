package irvine.oeis.a038;

import irvine.oeis.UnionSequence;
import irvine.oeis.a014.A014439;
import irvine.oeis.a014.A014440;
import irvine.oeis.a014.A014441;

/**
 * A038593 Differences between positive cubes in 1, 2 or 3 ways: union of A014439, A014440 and A014441.
 * @author Sean A. Irvine
 */
public class A038593 extends UnionSequence {

  /** Construct the sequence. */
  public A038593() {
    super(new A014439(), new UnionSequence(new A014440(), new A014441()));
  }
}
