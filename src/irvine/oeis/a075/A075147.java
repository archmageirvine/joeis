package irvine.oeis.a075;

import irvine.oeis.a074.A074650;
import irvine.oeis.triangle.ArraySelector;

/**
 * A075147 Number of Lyndon words (aperiodic necklaces) with n beads of n colors.
 * @author Georg Fischer
 */
public class A075147 extends ArraySelector {

  /** Construct the sequence. */
  public A075147() {
    super(1, new A074650(), 1, n -> new int[]{n, n});
  }
}
