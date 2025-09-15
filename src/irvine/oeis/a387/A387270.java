package irvine.oeis.a387;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387270 Numbers whose binary expansion consists of alternating runs of 1's and 0's where each run of 0's is exactly one shorter than the preceding run of 1's, and the expansion ends with a 0-run.
 * @author Sean A. Irvine
 */
public class A387270 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.SIX);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.shiftLeft(3).add(Z.SIX)); // Add new 110 to end
    final Z t = res.makeOdd();
    final long m = t.auxiliary(); // Length of trailing 0s
    mA.add(t.multiply2().add(1).shiftLeft(m + 1)); // Lengthen last run by one 1 and one 0
    return res;
  }
}

