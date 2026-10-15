package irvine.oeis.a355;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A355301 Normal undulating numbers where "undulating" means that the alternate digits go up and down (or down and up) and "normal" means that the absolute differences between two adjacent digits may differ.
 * @author Sean A. Irvine
 */
public class A355301 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A355301() {
    super(1, 0, Predicates.DIGIT_UNDULATE::is);
  }
}

