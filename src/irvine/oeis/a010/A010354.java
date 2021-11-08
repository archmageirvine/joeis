package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010354 Base-8 Armstrong or narcissistic numbers (written in base 10).
 * @author Sean A. Irvine
 */
public class A010354 extends FiniteSequence {

  /** Construct the sequence. */
  public A010354() {
    super(Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN,
      new Z("20"),
      new Z("52"),
      new Z("92"),
      new Z("133"),
      new Z("307"),
      new Z("432"),
      new Z("433"),
      new Z("16819"),
      new Z("17864"),
      new Z("17865"),
      new Z("24583"),
      new Z("25639"),
      new Z("212419"),
      new Z("906298"),
      new Z("906426"),
      new Z("938811"),
      new Z("1122179"),
      new Z("2087646"),
      new Z("3821955"),
      new Z("13606405"),
      new Z("40695508"),
      new Z("423056951"),
      new Z("637339524"),
      new Z("6710775966"),
      new Z("13892162580"),
      new Z("32298119799"),
      new Z("97095152738"),
      new Z("98250308556"),
      new Z("98317417420"),
      new Z("125586038802"),
      new Z("208198418654"),
      new Z("303865139807"),
      new Z("497577637886"),
      new Z("66627168170123"),
      new Z("66627168235658"),
      new Z("4998382669357032"),
      new Z("4998382669357033"),
      new Z("5190196317533094"),
      new Z("22836489425312227"),
      new Z("23446124043229664"),
      new Z("23446124043229665"),
      new Z("23464924977222355"),
      new Z("24055210066546108"),
      new Z("24055210067070396"),
      new Z("57033449858814311"),
      new Z("57033725899507007"),
      new Z("167186253795085291"),
      new Z("402810430791374316"),
      new Z("3418993385062038719"),
      new Z("1149785975022171819887"),
      new Z("6706538572304307945476"),
      new Z("8132598905239700935780"),
      new Z("8190352424223928636973"),
      new Z("8190353550123835479596"),
      new Z("22576559626136290521807162")
    );
  }
}
