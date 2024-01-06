package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067699 Number of comparisons made in a version of the sorting algorithm QuickSort for an array of size n with n identical elements.
 * @author Sean A. Irvine
 */
public class A067699 extends CachedSequence {

  private static final Z[] SMALL = {Z.ZERO, Z.FOUR, Z.EIGHT};

  /** Construct the sequence. */
  public A067699() {
    super(1, Integer.class, (self, k) -> k <= 3 ? SMALL[k - 1] : self.a((k + 1) / 2).add(self.a(k / 2)).add((k + 2) & ~1));
  }
}
