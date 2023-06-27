package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A003779 Number of spanning trees in P_5 x P_n.
 * @author Sean A. Irvine
 */
public class A003779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003779() {
    super(1, new long[]{-1, 209, -11936, 274208, -3112032, 19456019, -70651107, 152325888, -196664896,
    152325888, -70651107, 19456019, -3112032, 274208, -11936, 209},
      new Z[] {
        Z.ONE,
        Z.valueOf(209),
        Z.valueOf(30305),
        Z.valueOf(4140081),
        Z.valueOf(557568000),
        Z.valueOf(74795194705L),
        Z.valueOf(10021992194369L),
        Z.valueOf(1342421467113969L),
        Z.valueOf(179796299139278305L),
        new Z("24080189412483072000"),
        new Z("3225041354570508955681"),
        new Z("431926215138756947267505"),
        new Z("57847355494807961811035009"),
        new Z("7747424602888405489208931601"),
        new Z("1037602902862756514154816000000"),
        new Z("138964858389586339640223412108401")
      }
    );
  }
}
