package irvine.oeis.a057;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyhe;
import jmason.poly.PolyheCounter;

/**
 * A057712 Number of "polyhes" of order n: a polyhe of order n is obtained by taking a polyhex made of n hexagons (A000228); cutting each of the n hexagons along a diameter and throwing away half that hexagon, in such a way that the remaining figure (made of n half-hexagons) is connected.
 * @author Sean A. Irvine
 */
public class A057712 implements Sequence {

  private int mN = 0;
  private List<Polyhe> mPrevList = null;

  @Override
  public Z next() {
    final PolyheCounter pc = new PolyheCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    //System.out.println(mPrevList);
    return Z.valueOf(pc.getCu().getCounter(mN)); 
  }    
}
