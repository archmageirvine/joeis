package irvine.oeis.a080;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a014.A014486;

/**
 * A080971 A014486-encodings of the trees whose interior zigzag-tree (Stanley's c) is not branch-reduced (in the sense defined by Donaghey).
 * @author Sean A. Irvine
 */
public class A080971 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A080971() {
    super(0, new A014486(), new A080981());
  }
}

