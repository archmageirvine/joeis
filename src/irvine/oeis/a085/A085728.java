package irvine.oeis.a085;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A085728 There are never n semiprimes between any k and 2k; or values which do not occur in the sequence of number of semiprimes between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A085728 extends ComplementSequence {

  /** Construct the sequence. */
  public A085728() {
    super(1, new Sequence1() {
      private final Sequence mS = new A085727();
      private final TreeSet<Z> mA = new TreeSet<>();
      {
        mA.add(mS.next());
        mA.add(mS.next());
      }
      @Override
      public Z next() {
        // Heuristic size
        while (mA.first().multiply2().compareTo(mA.last()) > 0) {
          mA.add(mS.next());
        }
        return mA.pollFirst();
      }
    });
  }
}
