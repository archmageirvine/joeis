package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A006911 Theta series of laminated lattice LAMBDA_11^{max}.
 * @author Sean A. Irvine
 */
public class A006911 extends GfSequence {

  private static Series<Q> build() {
    final Series<Q> e1 = SeriesParser.parse("eta(x)");
    final Series<Q> e2 = SeriesParser.parse("eta(x^2)");
    final Series<Q> e4 = SeriesParser.parse("eta(x^4)");
    final Series<Q> e8 = SeriesParser.parse("eta(x^8)");
    final Series<Q> e16 = SeriesParser.parse("eta(x^16)");
    final Series<Q> e32 = SeriesParser.parse("eta(x^32)");

    final Series<Q> e1q2 = SQ.pow(e1, 2);
    final Series<Q> e1q4 = SQ.pow(e1, 4);
    final Series<Q> e1q6 = SQ.pow(e1, 6);
    final Series<Q> e1q8 = SQ.pow(e1, 8);

    final Series<Q> e2q2 = SQ.pow(e2, 2);
    final Series<Q> e2q7 = SQ.pow(e2, 7);
    final Series<Q> e2q8 = SQ.pow(e2, 8);
    final Series<Q> e2q9 = SQ.pow(e2, 9);
    final Series<Q> e2q12 = SQ.pow(e2, 12);

    final Series<Q> e4q3 = SQ.pow(e4, 3);
    final Series<Q> e4q5 = SQ.pow(e4, 5);
    final Series<Q> e4q8 = SQ.pow(e4, 8);
    final Series<Q> e4q10 = SQ.pow(e4, 10);
    final Series<Q> e4q12 = SQ.pow(e4, 12);

    final Series<Q> e8q2 = SQ.pow(e8, 2);
    final Series<Q> e8q5 = SQ.pow(e8, 5);
    final Series<Q> e8q6 = SQ.pow(e8, 6);
    final Series<Q> e8q7 = SQ.pow(e8, 7);
    final Series<Q> e8q8 = SQ.pow(e8, 8);
    final Series<Q> e8q9 = SQ.pow(e8, 9);
    final Series<Q> e8q10 = SQ.pow(e8, 10);
    final Series<Q> e8q11 = SQ.pow(e8, 11);
    final Series<Q> e8q12 = SQ.pow(e8, 12);

    final Series<Q> e16q3 = SQ.pow(e16, 3);
    final Series<Q> e16q4 = SQ.pow(e16, 4);
    final Series<Q> e16q5 = SQ.pow(e16, 5);
    final Series<Q> e16q7 = SQ.pow(e16, 7);
    final Series<Q> e16q8 = SQ.pow(e16, 8);
    final Series<Q> e16q9 = SQ.pow(e16, 9);

    final Series<Q> e32q2 = SQ.pow(e32, 2);
    final Series<Q> e32q4 = SQ.pow(e32, 4);
    final Series<Q> e32q6 = SQ.pow(e32, 6);

    final Series<Q> t1 = SQ.divide(SQ.multiply(SQ.multiply(e2q12, SQ.multiply(e4q8, e16)), new Q(169)), SQ.multiply(e1q8, e32q2));
    final Series<Q> t2 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q12, SQ.multiply(e4q8, SQ.multiply(e8q2, e32q2))), 2), new Q(130)), SQ.multiply(e1q8, e16q5));
    final Series<Q> t3 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q12, SQ.multiply(e4q10, e16q5)), 1), Q.EIGHT), SQ.multiply(e1q8, SQ.multiply(e8q6, e32q2)));
    final Series<Q> t4 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q12, SQ.multiply(e4q10, e32q2)), 3), new Q(16)), SQ.multiply(e1q8, SQ.multiply(SQ.pow(e8, 4), e16)));
    final Series<Q> t5 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q12, SQ.multiply(e4q12, e16q9)), 2), Q.FOUR), SQ.multiply(e1q8, SQ.multiply(e8q12, e32q2)));
    final Series<Q> t6 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q12, SQ.multiply(e4q12, SQ.multiply(e16q3, e32q2))), 4), Q.EIGHT), SQ.multiply(e1q8, e8q10));
    final Series<Q> t7 = SQ.divide(SQ.multiply(SQ.multiply(e2q7, SQ.multiply(e4q8, e8q5)), new Q(256)), SQ.multiply(e1q6, SQ.multiply(e16, e32q2)));
    final Series<Q> t8 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q7, SQ.multiply(e4q8, SQ.multiply(e8q7, e32q2))), 2), new Q(512)), SQ.multiply(e1q6, e16q7));
    final Series<Q> t9 = SQ.divide(SQ.multiply(SQ.multiply(e2q9, SQ.multiply(e4q3, SQ.multiply(e8q5, e16q4))), new Q(104)),
      SQ.multiply(e1q6, e32q4));
    final Series<Q> t10 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q9, SQ.multiply(e4q5, e16q8)), 1), new Q(208)), SQ.multiply(e1q6, SQ.multiply(e8, e32q4)));
    final Series<Q> t11 = SQ.divide(SQ.multiply(SQ.multiply(e2q2, SQ.multiply(e4q8, e8q10)), new Q(448)), SQ.multiply(e1q4, SQ.multiply(SQ.pow(e16, 3), e32q2)));
    final Series<Q> t12 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e2q2, SQ.multiply(e4q8, SQ.multiply(e8q12, e32q2))), 2), new Q(384)), SQ.multiply(e1q4, e16q9));
    final Series<Q> t13 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e4q10, e8q9), 1), new Q(768)), SQ.multiply(e1q2, SQ.multiply(SQ.pow(e2, 3), SQ.multiply(e16, e32q2))));
    final Series<Q> t14 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e4q10, SQ.multiply(e8q11, e32q2)), 3), new Q(512)),
      SQ.multiply(e1q2, SQ.multiply(SQ.pow(e2, 3), e16q7)));
    final Series<Q> t15 = SQ.divide(SQ.multiply(SQ.multiply(e4q12, SQ.multiply(e8q6, e16q7)), new Q(256)), SQ.multiply(e2q8, e32q6));
    final Series<Q> t16 = SQ.divide(SQ.multiply(SQ.shift(SQ.multiply(e4q12, SQ.multiply(e8q8, e16)), 2), new Q(1536)), SQ.multiply(e2q8, e32q2));

//    System.out.println("t1=" + SQ.toString(t1, 10));
//    System.out.println("t2=" + SQ.toString(t2, 10));
//    System.out.println("t3=" + SQ.toString(t3, 10));
//    System.out.println("t4=" + SQ.toString(t4, 10));
//    System.out.println("t5=" + SQ.toString(t5, 10));
//    System.out.println("t6=" + SQ.toString(t6, 10));
//    System.out.println("t7=" + SQ.toString(t7, 10));
//    System.out.println("t8=" + SQ.toString(t8, 10));
//    System.out.println("t9=" + SQ.toString(t9, 10));
//    System.out.println("t10=" + SQ.toString(t10, 10));
//    System.out.println("t11=" + SQ.toString(t11, 10));
//    System.out.println("t12=" + SQ.toString(t12, 10));
//    System.out.println("t13=" + SQ.toString(t13, 10));
//    System.out.println("t14=" + SQ.toString(t14, 10));
//    System.out.println("t15=" + SQ.toString(t15, 10));
//    System.out.println("t16=" + SQ.toString(t16, 10));

    return SQ.add(SQ.subtract(SQ.add(SQ.subtract(SQ.add(SQ.add(SQ.subtract(SQ.subtract(SQ.subtract(SQ.subtract(SQ.add(SQ.add(SQ.subtract(SQ.subtract(SQ.add(t1, t2), t3), t4), t5), t6), t7), t8), t9), t10), t11), t12), t13), t14), t15), t16);
  }

  /** Construct the sequence. */
  public A006911() {
    super(0, build());
  }
}
