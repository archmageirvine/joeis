package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a002.A002808;
import irvine.oeis.a050.A050436;

/**
 * A076238 Remainder when 3rd order composite ccc[n]=A050436[n] is divided by first order composite c[n]=A002808[n].
 * @author Sean A. Irvine
 */
public class A076238 extends Combiner {

  /** Construct the sequence. */
  public A076238() {
    super(1, new A050436(), new A002808(), Z::mod);
  }
}
