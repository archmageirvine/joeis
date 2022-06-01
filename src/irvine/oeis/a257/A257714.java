package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A257714 Pentagonal numbers (A000326) that are the sum of five consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A257714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257714() {
    super(new long[] {1, -1, 0, 0, -10749957122L, 10749957122L, 0, 0, 1},
      new Z[] {Z.valueOf(44290), Z.valueOf(487065), Z.valueOf(97731740), Z.valueOf(1074935965), Z.valueOf(476036316661270L), Z.valueOf(5235848584389645L), Z.valueOf(1050611935177517000L), new Z("11555515453364758825"), new Z("5117369992623387417086890")});
  }
}
