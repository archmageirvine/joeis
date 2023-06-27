package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A257954 Heptagonal numbers (A000566) that are the sum of seven consecutive heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A257954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257954() {
    super(1, new long[] {1, -1, -268510893235202L, 268510893235202L, 1},
      new Z[] {
        Z.valueOf(380300389),
        Z.valueOf(13416840252277L),
        new Z("102114787991863121805337"),
        new Z("3602567760523753992917728705"),
        new Z("27418932936218445934971843788960252365")
      });
  }
}
