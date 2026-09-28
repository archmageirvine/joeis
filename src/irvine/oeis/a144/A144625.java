package irvine.oeis.a144;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057556;

/**
 * A144625 List of triples (i,j,k) (i&gt;=0, j&gt;=0, k&gt;=0) in canonical order used to convert an infinite tetrahedron of numbers to a linear sequence.
 * @author Sean A. Irvine
 */
public class A144625 extends Sequence0 {

  private final Sequence mA = new A057556();
  private final LinkedList<Z> mL = new LinkedList<>();

  @Override
  public Z next() {
    if (mL.isEmpty()) {
      mL.add(mA.next());
      mL.add(mA.next());
      mL.add(mA.next());
    }
    return mL.pollLast();
  }
}

