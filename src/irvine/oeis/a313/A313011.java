package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313011 Coordination sequence Gal.6.465.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313011 extends TilingSequence {

  /** Construct the sequence. */
  public A313011() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C120+1"
        , "6.3.3.3.3;D300+3,A300+1,C60+5,B300-4,E0+3"
        , "4.4.3.3.3;A240+4,C180+2,A300-4,B240-3,B300+3"
        , "6.6.3.3;F300+3,D60-2,B60+1,E60+2"
        , "3.3.3.3.3.3;F240+4,D300+4,B0+5,B300-5,D0-4,F60-4"
        , "6.6.3.3;F180-1,F180+2,D60+1,E120+1"
        });
    defineBaseSet(0);
  }
}
