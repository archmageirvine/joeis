package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A028464 Number of perfect matchings in graph C_{3} X C_{3} X P_{2n}.
 * @author Sean A. Irvine
 */
public class A028464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028464() {
    super(new long[]{1, -2759, 325448, -10121602, 125374286, -684055000, 1622518920, -1622518920, 684055000, -125374286, 10121602, -325448, 2759},
      new Z[]{
        Z.ONE,
        new Z("1120"),
        new Z("2861029"),
        new Z("7537209013"),
        new Z("19875272280736"),
        new Z("52411725012875905"),
        new Z("138211512392292291937"),
        new Z("364468498187098321751584"),
        new Z("961115930137025304064194421"),
        new Z("2534495671871264129163903449317"),
        new Z("6683552014192354263830206528781536"),
        new Z("17624755892139792658340655302347504609"),
        new Z("46477085776829046768207330138587650280353"),
      }
    );
  }
}
