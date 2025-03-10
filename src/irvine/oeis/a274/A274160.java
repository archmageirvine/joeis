package irvine.oeis.a274;

import irvine.math.group.GaussianIntegers;
import irvine.math.zi.Zi;
import irvine.oeis.KimberlingTreeSequence;

/**
 * A274160 Number of integers in n-th generation of tree T(i) defined in Comments.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A274160 extends KimberlingTreeSequence<Zi> {

  /** Construct the sequence. */
  public A274160() {
    super(0, GaussianIntegers.SINGLETON, Zi.I);
  }
}
