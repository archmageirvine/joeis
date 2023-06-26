package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010352 Base-9 Armstrong or narcissistic numbers, written in base 9.
 * @author Sean A. Irvine
 */
public class A010352 extends FiniteSequence {

  /** Construct the sequence. */
  public A010352() {
    super(1, FINITE, Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN, Z.EIGHT,
      new Z("45"),
      new Z("55"),
      new Z("150"),
      new Z("151"),
      new Z("570"),
      new Z("571"),
      new Z("2446"),
      new Z("12036"),
      new Z("12336"),
      new Z("14462"),
      new Z("2225764"),
      new Z("6275850"),
      new Z("6275851"),
      new Z("12742452"),
      new Z("356614800"),
      new Z("356614801"),
      new Z("1033366170"),
      new Z("1033366171"),
      new Z("1455770342"),
      new Z("8463825582"),
      new Z("131057577510"),
      new Z("131057577511"),
      new Z("358376613717"),
      new Z("486350373816"),
      new Z("1854014534430"),
      new Z("1854014534431"),
      new Z("2257238313123"),
      new Z("2376681144634"),
      new Z("2376684144633"),
      new Z("4255437336818"),
      new Z("1501322621437658"),
      new Z("14172228544021147"),
      new Z("25081352574053826"),
      new Z("35812034841853506"),
      new Z("223786486131001012"),
      new Z("1042226366438765012"),
      new Z("237082876620762854346"),
      new Z("318880557521176087267"),
      new Z("1537167772620206177887"),
      new Z("17632082685752060101830"),
      new Z("17632082685752060101831"),
      new Z("17848085426122761171423"),
      new Z("1817532181082832263512440"),
      new Z("1817532181082832263512441"),
      new Z("1832330762825040066527288"),
      new Z("12438445561067680143612802"),
      new Z("21050515474420208822838438"),
      new Z("11727236157010148446208821268"),
      new Z("104836124432728001478001038310"),
      new Z("104836124432728001478001038311")
    );
  }
}
