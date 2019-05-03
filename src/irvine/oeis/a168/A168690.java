package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168690 Number of reduced words of length n in Coxeter group on 13 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^17 =</code> I.
 * @author Sean A. Irvine
 */
public class A168690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168690() {
    super(new long[] {-66, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, new long[] {13, 156, 1872, 22464, 269568, 3234816, 38817792, 465813504, 5589762048L, 67077144576L, 804925734912L, 9659108818944L, 115909305827328L, 1390911669927936L, 16690940039135232L, 200291280469622784L, 2403495365635473330L}, 1);
  }
}
