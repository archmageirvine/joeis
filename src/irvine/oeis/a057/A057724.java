package irvine.oeis.a057;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyare;
import jmason.poly.PolyareCounter;

/**
 * A057724 Number of "polyares" of order n (turning over allowed).
 * @author Sean A. Irvine
 */
public class A057724 implements Sequence {

  private int mN = 0;
  private List<Polyare> mPrevList = null;

  @Override
  public Z next() {
    final PolyareCounter pc = new PolyareCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    //System.out.println(mPrevList);
    return Z.valueOf(pc.getCu().getCounter(mN)); 
  }    
}
