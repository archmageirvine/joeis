package irvine.oeis.a052;
// Manually modified 2020-09-22

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a000.A000142;

/**
 * A052856 E.g.f.: (1-3*exp(x)+exp(2*x))/(exp(x)-2).
 * @author Georg Fischer
 */
public class A052856 extends PrependSequence {

  /** Construct the sequence. */
  public A052856() {
    super(1, new Stirling2TransformSequence(new A000142(), 0), 0);
  }
  
  @Override
  public Z next() {
    return super.next().add(Z.ONE);
  }
}
