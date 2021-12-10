package irvine.oeis.a052;
// Manually modified 2020-09-22

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a000.A000142;


/**
 * A052875 E.g.f.: (exp(x)-1)^2/(2-exp(x)).
 * @author Georg Fischer
 */
public class A052875 extends PrependSequence {

  /** Construct the sequence. */
  public A052875() {
    super(1, new Stirling2TransformSequence(new A000142(), 0), 1);
  }
  
  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}
