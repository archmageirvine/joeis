package irvine.oeis.a024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A024781 Every suffix prime and no 0 digits in base <code>6</code> (written in base <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A024781 extends FiniteSequence {

  private static void build(final Set<Z> set, final Z suffix, final int base) {
    if (new Z(suffix.toString(), base).isProbablePrime()) {
      set.add(suffix);
      for (int p = 1; p < base; ++p) {
        build(set, new Z(p + suffix.toString()), base);
      }
    }
  }

  static List<Z> build(final int base) {
    final TreeSet<Z> set = new TreeSet<>();
    for (int p = 2; p < base; ++p) {
      build(set, Z.valueOf(p), base);
    }
    return new ArrayList<>(set);
  }

  /** Construct the sequence. */
  public A024781() {
    super(build(6));
  }
}
