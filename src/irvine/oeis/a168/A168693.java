package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A168693 Number of reduced words of length n in Coxeter group on 16 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^17 =</code> I.
 * @author Sean A. Irvine
 */
public class A168693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168693() {
    super(new long[] {-105, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
      new Z[] {
        Z.valueOf(16),
        Z.valueOf(240),
        Z.valueOf(3600),
        Z.valueOf(54000),
        Z.valueOf(810000),
        Z.valueOf(12150000),
        Z.valueOf(182250000),
        Z.valueOf(2733750000L),
        Z.valueOf(41006250000L),
        Z.valueOf(615093750000L),
        Z.valueOf(9226406250000L),
        Z.valueOf(138396093750000L),
        Z.valueOf(2075941406250000L),
        Z.valueOf(31139121093750000L),
        Z.valueOf(467086816406250000L),
        Z.valueOf(7006302246093750000L),
        new Z("105094533691406249880")
      },
      Z.ONE);
  }
}
