package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028931 Strings giving winning positions in Tchoukaillon (or Mancala) solitaire.
 * @author Sean A. Irvine
 */
public class A028931 extends A028932 {

  // The definition of this sequence is pretty unclear about what should happen once
  // the number of stones in a particular positions exceeds 9.  Here we treat those
  // counts as integers and simply concatenate them to form the strings described in
  // the sequence.  This means that larger positions are inherently ambiguous.

  @Override
  public Z next() {
    step();
    final StringBuilder sb = new StringBuilder();
    for (int k = mStones.length - 1; k >= 0; --k) {
      sb.append(mStones[k]);
    }
    return new Z(sb);
  }
}

