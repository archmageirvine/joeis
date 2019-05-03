package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167945 Number of reduced words of length n in Coxeter group on 30 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^16 =</code> I.
 * @author Sean A. Irvine
 */
public class A167945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167945() {
    super(new long[] {-406, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
      new Z[] {Z.valueOf(30), Z.valueOf(870), Z.valueOf(25230), Z.valueOf(731670), Z.valueOf(21218430), Z.valueOf(615334470), Z.valueOf(17844699630L), Z.valueOf(517496289270L), Z.valueOf(15007392388830L), Z.valueOf(435214379276070L), Z.valueOf(12621216999006030L), Z.valueOf(366015292971174870L), new Z("10614443496164071230"), new Z("307818861388758065670"), new Z("8926746980273983904430"), new Z("258875662427945533228035")}, Z.ONE);
  }
}
