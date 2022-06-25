package irvine.oeis;

/**
 * A sequence for which the offset information is available.
 * @author Sean A. Irvine
 */
public interface SequenceWithOffset extends Sequence {

  /**
   * Return the offset associated with this sequence.
   * @return the offset
   */
  int getOffset();
}

