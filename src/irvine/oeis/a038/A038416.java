package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038416 Coordination sequence <code>Z12</code> for Zeolite Code STT.
 * @author Sean A. Irvine
 */
public class A038416 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038416() {
    super(
      new long[] {1, 4, 10, 18, 35, 59, 77, 106, 146, 169, 203, 230, 269, 297, 299, 322, 356, 354, 350, 331, 347, 363, 342, 260, 247, 236, 149, 22, -85, -211, -315, -532, -748, -882, -1068, -1363, -1548, -1736, -1930, -2153, -2374, -2578, -2659, -2805, -3030, -3129, -3089, -3210, -3191, -3108, -3016, -2778, -2543, -2317, -1788, -1294, -921, -288, 463, 1174, 1962, 2728, 3527, 4599, 5512, 6312, 7310, 8418, 9216, 10177, 11082, 11936, 12751, 13280, 13693, 14571, 14746, 14661, 14645, 14581, 14253, 13743, 12561, 11689, 10731, 9311, 7314, 5824, 3773, 1468, -883, -3421, -6208, -8639, -12171, -15163, -17707, -20891, -24396, -27151, -30094, -32714, -35233, -37992, -40357, -41478, -43349, -45054, -45395, -45972, -46128, -45420, -44940, -43389, -40935, -39070, -36275, -32262, -28181, -24238, -18939, -13776, -7818, -1304, 4645, 11061, 19164, 25584, 32748, 40119, 47514, 54547, 61852, 67780, 74640, 80897, 86412, 90531, 95798, 98977, 102021, 104188, 105139, 105267, 105559, 103008, 100907, 97344, 92803, 87052, 80994, 73159, 65031, 55989, 45803, 34644, 24057, 11419, -992, -13777, -27438, -40397, -53678, -67699, -80735, -93440, -106108, -117977, -129597, -140013, -149744, -157992, -166402, -172325, -177542, -181386, -183954, -184470, -184703, -181557, -178765, -173098, -166532, -157925, -148838, -136978, -125071, -110718, -96303, -79752, -63757, -44621, -26827, -7621, 11661, 31698, 51124, 71937, 90122, 109972, 128315, 146557, 162966, 179333, 193482, 207151, 219101, 229537, 237821, 245488, 249706, 253244, 255045, 253578, 251162, 246616, 239544, 231228, 220966, 208012, 194547, 178627, 161265, 142629, 123784, 101439, 80198, 57638, 34284, 10716, -12592, -38100, -60119, -84170, -107097, -129461, -149734, -171138, -189070, -207002, -222830, -237411, -248772, -261431, -268369, -275235, -280119, -282358, -282008, -281295, -275698, -270185, -262041, -251807, -238865, -226003, -209515, -192120, -174132, -153826, -132379, -111579, -87494, -64361, -41759, -17024, 6869, 30272, 53956, 76523, 97886, 119866, 139959, 158133, 175798, 192359, 205356, 219425, 229735, 238241, 245717, 250792, 253033, 255391, 253555, 250949, 245945, 239853, 230496, 221495, 209460, 195896, 181499, 166498, 148774, 132316, 112573, 93725, 74876, 55054, 34520, 15290, -4598, -23389, -42259, -60057, -77684, -93120, -108646, -123070, -135160, -146658, -157072, -165035, -172667, -177803, -181421, -184383, -185032, -184184, -182022, -178595, -173517, -167338, -159913, -151195, -141928, -131749, -119637, -108510, -95797, -82982, -69843, -56057, -42669, -29811, -15924, -3171, 9637, 21561, 33309, 44020, 54380, 63657, 72007, 79847, 86552, 91600, 97027, 100501, 103121, 105131, 105532, 105378, 104872, 102452, 99730, 96307, 92058, 87052, 82006, 75792, 69132, 63026, 55893, 48453, 41720, 33986, 26775, 20146, 12524, 5781, -386, -6885, -12887, -18053, -23318, -27987, -31655, -35594, -38781, -40786, -43302, -44803, -45259, -46292, -46323, -45589, -45109, -43801, -42038, -40655, -38464, -35611, -33444, -30729, -27480, -24878, -21692, -18257, -15691, -12490, -9221, -6820, -3919, -996, 1083, 3305, 5575, 7194, 9028, 10677, 11410, 12491, 13842, 14111, 14462, 14899, 14707, 14817, 14650, 13854, 13422, 13066, 12011, 11150, 10513, 9444, 8437, 7611, 6451, 5655, 4832, 3642, 2793, 2244, 1265, 449, -132, -793, -1265, -1725, -2349, -2539, -2674, -3006, -3211, -3191, -3198, -3136, -3146, -3102, -2888, -2651, -2608, -2453, -2183, -1966, -1785, -1596, -1414, -1096, -904, -798, -572, -354, -196, -96, -11, 121, 251, 276, 270, 317, 376, 359, 362, 343, 339, 365, 340, 303, 310, 268, 241, 218, 175, 138, 123, 84, 59, 36, 18, 7, 13, -5, -6, 2, 5, -5, -2, -6, 0, 1, -3, -5, 1, 1, 0, -1, 0, 2, 3, -1, 0, 0, -1, 0, -1, 1, 1},
      new int[] {7, 11, 19, 20, 23, 24, 25, 27, 29, 30, 32, 34, 36, 40, 42, 44, 52});
  }
}
