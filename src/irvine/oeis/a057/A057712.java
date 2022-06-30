package irvine.oeis.a057;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyhes;
import jmason.poly.PolyhesCounter;

/**
 * A057782.
 * @author Sean A. Irvine
 */
public class A057712 implements Sequence {

  private int mN = 0;
  private List<Polyhes> mPrevList = null;

  @Override
  public Z next() {
    final PolyhesCounter pc = new PolyhesCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    //System.out.println(mPrevList);
    return Z.valueOf(pc.getCu().getCounter(mN)); 
  }    
}
