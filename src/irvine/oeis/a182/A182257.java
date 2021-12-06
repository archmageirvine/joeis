package irvine.oeis.a182;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001466;

/**
 * A182257 Denominators of Egyptian fraction expansion of Pi.
 * In contrast to A001466, there are 3 additional ones.
 * @author Georg Fischer
 */
  public class A182257 extends PrependSequence {
  /** Construct the sequence */
  public A182257() {
    super(new A001466(), 1, 1, 1);
  }
}
