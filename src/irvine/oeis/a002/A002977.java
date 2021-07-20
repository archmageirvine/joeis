package irvine.oeis.a002;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002977 Klarner-Rado sequence: a(1) = 1; subsequent terms are defined by the rule that if m is present so are 2m+1 and 3m+1.
 * @author Sean A. Irvine
 */
public class A002977 implements Sequence {

  private final TreeSet<Z> mSeq = new TreeSet<>();
  {
    mSeq.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z n = mSeq.pollFirst();
    mSeq.add(n.multiply2().add(1));
    mSeq.add(n.multiply(3).add(1));
    return n;
  }
}
